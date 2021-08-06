package com.example.springboot;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void metadataAvailable() throws IOException {
        DocumentContext json = JsonPath.parse(StreamUtils.copyToString(
                Application.class.getResourceAsStream("/META-INF/spring-configuration-metadata.json"),
                StandardCharsets.UTF_8
        ));

        assertThat(json.<List<String>>read("$.groups[*].name"))
                .containsExactly("com.example");
        assertThat(json.<List<String>>read("$.properties[*].name"))
                .containsExactly("com.example.ip", "com.example.name", "com.example.old-name");
    }

}

