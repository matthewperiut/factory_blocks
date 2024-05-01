import os
import json

def create_blockstate_json(block_name, num_files):
    return {
        "variants": {
            "": [
                {"model": f"factory_blocks:block/{block_name}/{block_name}_{i}", "weight": 1} for i in range(1, num_files + 1)
            ]
        }
    }

def create_model_json(block_name, index):
    return {
        "parent": "block/cube_all",
        "textures": {
            "all": f"factory_blocks:block/ctm/{block_name}/{index}",
            "particle": f"factory_blocks:block/{block_name}"  # Using '1.png' as the default particle texture
        }
    }

def main():
    block_name = input("Enter the name of the block: ")
    num_files = int(input("Enter the number of files (starting from 1): "))
    resourcepack_path = './resourcepack'
    blockstates_path = f'{resourcepack_path}/blockstates'
    models_path = f'{resourcepack_path}/models/block/{block_name}'

    os.makedirs(blockstates_path, exist_ok=True)
    os.makedirs(models_path, exist_ok=True)

    # Create blockstate JSON
    with open(f'{blockstates_path}/{block_name}.json', 'w') as f:
        json.dump(create_blockstate_json(block_name, num_files), f, indent=4)

    # Create model JSONs and texture files
    for i in range(1, num_files + 1):
        with open(f'{models_path}/{block_name}_{i}.json', 'w') as f:
            json.dump(create_model_json(block_name, i), f, indent=4)

    print("Resource pack created successfully!")

if __name__ == "__main__":
    main()
