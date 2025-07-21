if(NOT TARGET hermes-engine::libhermes)
add_library(hermes-engine::libhermes SHARED IMPORTED)
set_target_properties(hermes-engine::libhermes PROPERTIES
    IMPORTED_LOCATION "/Users/diego/.gradle/caches/8.14.1/transforms/a048f7d764f4c08ab8d73259d3d0ae85/transformed/hermes-android-0.80.0-debug/prefab/modules/libhermes/libs/android.arm64-v8a/libhermes.so"
    INTERFACE_INCLUDE_DIRECTORIES "/Users/diego/.gradle/caches/8.14.1/transforms/a048f7d764f4c08ab8d73259d3d0ae85/transformed/hermes-android-0.80.0-debug/prefab/modules/libhermes/include"
    INTERFACE_LINK_LIBRARIES ""
)
endif()

