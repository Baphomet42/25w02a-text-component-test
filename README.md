# Text Test for Snapshot 25w02a

## This is for demo purposes only, do not use this in a real world

This 25w02a fabric mod is a simple proof of concept that explores the possibility of storing all text components as its compound form, and not simplifying texts like `{text:"foo"}` to `"foo"`

The aim of this change would be to make working with text components in commands simpler, as there would be a single consistent form. This also attempts to address bugs in 25w02a that all result from simplified text components not behaving well in certain contexts.

See the following bugs for more info:
+ https://bugs.mojang.com/browse/MC-279232 "SNBT text components prevent mixing text styles in lists"
+ https://bugs.mojang.com/browse/MC-279252 "Editing a single line of a sign is no longer possible in some situations"
+ https://bugs.mojang.com/browse/MC-279258 "Creating a sign with formatted text serializes lines without formatting incorrectly"

Known areas where this mod would fix problems:
+ `extra` field of text components
+ signs
+ lore
Known areas where this mod does not fix the issue of mixed lists in text components:
+ `with` field of text components

Relevant discord threads:
+ "New Text Format: Broken things" from Minecraft Commands
    + https://discord.com/channels/154777837382008833/1326585270610427954
+ Feedback post from Minecraft Feedback
    + https://discord.com/channels/1138536747932864532/1327047643062341722
