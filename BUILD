java_plugin(
    name = "spring_boot_configuration_processor",
    processor_class = "org.springframework.boot.configurationprocessor.ConfigurationMetadataAnnotationProcessor",
    deps = ["@maven//:org_springframework_boot_spring_boot_configuration_processor"],
)

java_library(
    name = "application",
    srcs = glob(["src/main/java/**/*.java"]),
    plugins = [":spring_boot_configuration_processor"],
    deps = [
        "@maven//:org_springframework_boot_spring_boot",
        "@maven//:org_springframework_boot_spring_boot_autoconfigure",
    ],
)

java_test(
    name = "ApplicationTests",
    srcs = ["src/test/java/com/example/springboot/ApplicationTests.java"],
    deps = [
        ":application",
        "@maven//:com_jayway_jsonpath_json_path",
        "@maven//:org_assertj_assertj_core",
        "@maven//:org_springframework_boot_spring_boot_test",
        "@maven//:org_springframework_spring_core",
        "@maven//:org_springframework_spring_test",
    ],
)
