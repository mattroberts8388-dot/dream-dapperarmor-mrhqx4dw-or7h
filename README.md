# Dapper Armor

A simple Fabric mod for Minecraft 1.20.1 that adds a fancy **Top Hat** helmet and a formal **Suit** armor set (jacket, trousers, dress shoes) so your character can dress to impress.

## What's inside

- **Top Hat** (helmet)
- **Suit Jacket** (chestplate)
- **Suit Trousers** (leggings)
- **Dress Shoes** (boots)

All items are craftable with black wool (and paper for the hat) and appear in their own **Dapper Armor** creative tab.

> Note: The included armor and item texture files are empty placeholders so the project builds correctly. The mod works fully — you can paint the PNG files in `src/main/resources/assets/dapperarmor/textures/` to give your outfit a custom look. The armor overlay textures are `dapper_layer_1.png` (helmet/chestplate/boots layer) and `dapper_layer_2.png` (leggings layer).

## Building the mod for FREE using GitHub (no Java install needed)

You do **not** need to install Java or any tools. GitHub will build the `.jar` for you.

### Steps

1. **Create a GitHub account** at https://github.com (free).
2. Click the **+** in the top-right → **New repository**. Give it a name (for example `dapper-armor`) and click **Create repository**.
3. On the new empty repository page, click the link **"uploading an existing file"**.
4. **Extract the downloaded zip** of this project on your computer.
5. **On macOS, press `Cmd + Shift + .` (period) in Finder** to reveal hidden files.
   ⚠️ **This is critical.** The `.github` folder is **invisible by default on macOS**. If you do not reveal it and upload it, the automatic build will **never run** and you will get no `.jar`.
6. Open the extracted folder, **select ALL files and folders INSIDE it** — including the hidden `.github` folder — and **drag them into the GitHub upload page**.
   - Drag the **contents** of the folder, NOT the folder itself.
7. Scroll down and click **Commit changes**.
8. Click the **Actions** tab at the top of your repository.
9. Wait about **2 minutes** for the build to finish (green checkmark).
10. Click the finished build, scroll down to **Artifacts**, and download **mod-jar**.
11. Unzip it and copy the `.jar` file into your `.minecraft/mods/` folder.

### Requirements to run

- Minecraft **1.20.1**
- **Fabric Loader** and **Fabric API**

Enjoy looking dapper!