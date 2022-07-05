import os
import math
import shutil
import errno

from PIL import Image
from shutil import copyfile
from pathlib import Path

modid = "factory_blocks"

def block_state(name):
    f = open("blockstates/" + name + ".json", 'w')
    state = \
    [\
    '{\n',\
    '  "variants": {\n',\
    '    "": { "model": "' + modid + ':block/' + name + '" }\n',\
    '  }\n',\
    '}',\
    ]
    for x in state:
        f.write(x)

def block_model(name):
    f = open("models/block/" + name + ".json", 'w')
    model = \
    [\
    '{\n',\
    '  "parent": "block/cube_all",\n',\
    '  "textures": {\n',\
    '    "all": "' + modid + ':block/', name,'"\n',\
    '  }\n',\
    '}',\
    ]
    for x in model:
        f.write(x)

def item_model(name):
    f = open("models/item/" + name + ".json", 'w')
    model = \
    [\
    '{\n',\
    '  "parent": "' + modid + ':block/', name, '"\n',\
    "}"\
    ]
    for x in model:
        f.write(x)

def loot_table(name):
    f = open("../../data/" + modid + "/loot_tables/blocks/" + name + ".json", 'w')
    loot =\
    [\
    '{\n',\
    '  "type": "minecraft:block",\n',\
    '  "pools": [\n',\
    '    {\n',\
    '      "rolls": 1,\n',\
    '      "entries": [\n',\
    '        {\n',\
    '          "type": "minecraft:item",\n',\
    '          "name": "' + modid + ':', name,'"\n',\
    '        }\n',\
    '      ],\n',\
    '      "conditions": [\n',\
    '        {\n',\
    '          "condition": "minecraft:survives_explosion"\n',\
    '        }\n',\
    '      ]\n',\
    '    }\n',\
    '  ]\n',\
    '}',\
    ]
    for x in loot:
        f.write(x)

def texture(name):
    file = Path(input("texture?").replace("'","").rstrip().lstrip())
    shutil.copy2(file,"textures/block/" + name + ".png")


def ctm_prop(name):
    os.mkdir("optifine/ctm/" + name)

    ctmfile = open("optifine/ctm/" + name + "/" + name + ".properties", 'w')
    ctmfile.write('matchBlocks=' + modid + ':' + name + '\n')
    ctmfile.write('method=ctm_compact\n')
    ctmfile.write('innerSeams=true\n')
    ctmfile.write('tiles=0-4')

    shutil.copy2("textures/block/" + name + ".png", "optifine/ctm/" + name + "/0.png")
    sheet = Image.open(Path(input("ctm file?").replace("'","").rstrip().lstrip()))
    path = "optifine/ctm/" + name
    count = 1
    size = 2
    for y in range(size):
        for x in range(size):
            a = (x + 1) * 16
            b = (y + 1) * 16
            icon = sheet.crop((a - 16, b - 16, a, b))
            icon.save(path + "/{}.png".format(count))
            count += 1
    

def all(name):
    block_state(name)
    block_model(name)
    item_model(name)
    loot_table(name)
    texture(name)
    #ctm_prop(name)

all(input("BlockID?\n"))