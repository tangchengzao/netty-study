package com.tangcz.javatec02.ch01.optional;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 月汐
 * @date 2019/10/23 11:31
 */
public class OptionalTest {

    public static void main(String[] args) throws IOException {
//        String contents = new String(Files.readAllBytes(Paths.get("")), StandardCharsets.UTF_8);
//        List<String> words = Arrays.asList(contents.split("\\PL+"));
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<String>> map = locales.collect(Collectors.toMap(Locale::getDisplayLanguage, locale ->
                        Collections.singleton(locale.getDisplayLanguage()),
                (a, b) -> {
            Set<String> union = new HashSet<>(a);
            union.addAll(b);
            return union;
            }
            )
        );
    }

}
