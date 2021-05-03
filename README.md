# ! This is obsolete as of Terra 5.2.1 !

# TerraFabricServer

TerraFabricServer is a Fabric mod that allows servers to use Terra. 

Loom (Fabric's Gradle plugin)
is currently broken in multi-project builds, preventing us from being able to
effectively use mixins. As a result, we are unable to inject the required code into the
server. This mod is a temporary workaround to that.

## Download
Download from the "Releases" section of this repository.

## Usage
Install Terra and TerraFabricServer on your Fabric server. In `server.properties`,
set the `level-type` key to `terra\:config_id` E.G. `level-type=terra\:default` for the default config.
