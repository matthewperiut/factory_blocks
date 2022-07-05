import os

os.chdir("..")

def replace_text_in_file(input_file, text, replacement):
    with open(input_file, "rt") as fin:
        with open("output.txt", "wt") as fout:
            for line in fin:
                fout.write(line.replace(text, replacement))
    
    os.remove(input_file)
    os.rename("output.txt", input_file)

modid = input("What is your modid?\n").lower()
name = input("What is your name?\n").lower()
description = input("Describe your mod:\n")

pmodid = "example"
pname = "fabricmc"
pModid = pmodid[0].upper() + pmodid[1:]
Modid = modid[0].upper() + modid[1:]

# Modify gradle.properties
replace_text_in_file("gradle.properties", "com.example", "com." + name)
replace_text_in_file("gradle.properties", "fabric-example-mod", modid + "-mod")

# Modify Code Files
os.mkdir ("src/main/java/net/" + name)
os.mkdir ("src/main/java/net/" + name + "/" + modid)
os.rename("src/main/java/net/" + pname + "/" + pmodid, "src/main/java/net/" + name + "/" + modid)
os.removedirs("src/main/java/net/" + pname)

new_java_file = "src/main/java/net/" + name + "/" + modid + "/" + Modid + "Mod.java"
os.rename("src/main/java/net/" + name + "/" + modid + "/" + pModid + "Mod.java", new_java_file)
replace_text_in_file(new_java_file, "net." + pname + "." + pmodid, "net." + name + "." + modid)
replace_text_in_file(new_java_file, pModid + "Mod", Modid + "Mod")
replace_text_in_file(new_java_file, pmodid, modid)

# Modify Resource Files
mod_assets = "src/main/resources/assets/" + modid
os.rename("src/main/resources/assets/" + pmodid, mod_assets)
resrc_json = "src/main/resources/fabric.mod.json"
replace_text_in_file(resrc_json, pmodid, modid)
replace_text_in_file(resrc_json, pname, name)
replace_text_in_file(resrc_json, "AUTHOR", name)
replace_text_in_file(resrc_json, pModid + " Mod", Modid + " Mod")
replace_text_in_file(resrc_json, pModid + "Mod", Modid + "Mod")
replace_text_in_file(resrc_json, "description_input", description)

replace_text_in_file(mod_assets + "/blockstates/test_block.json", pmodid, modid)
replace_text_in_file(mod_assets + "/lang/en_us.json", pmodid, modid)
replace_text_in_file(mod_assets + "/models/block/test_block.json", pmodid, modid)
replace_text_in_file(mod_assets + "/models/item/test_block.json", pmodid, modid)
replace_text_in_file(mod_assets + "/optifine/ctm/test_block/test_block.properties", pmodid, modid)