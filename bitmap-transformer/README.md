# Bitmap Transformer
This is a command line interface (CLI) written in Java that takes in 3 arguments to read in a bitmap, make a transformation to it, and save it to a new file.

# Running
This app requires a Java installation and gradle to be able to run. CD into the project folder and run 'gradle run --args "FILE_PATH OUTPUT_PATH TRANSFORM". See [arguments](#arguments) for information on valid commands

# Arguments
FILE_PATH: Path to the bpm file on your file system that you intend to transform. Can be a relative or absolute path.

OUTPUT_PATH: The location where you would like to save the transformed bitmap image to. Should include the directory and end with the file name, including the .BMP extension. (ex - resources/transform.BPM)

TRANSFORM: The type of transformation to be applied.
* flipVertical - Will flip the image across the x axis.
* flipHorizontal - Will flip the image across the y axis.
* convertGrayscale - Will calculate and convert all pixel rgb values into a grayscale value.
* darken - Will make all the colors in the image darker.

