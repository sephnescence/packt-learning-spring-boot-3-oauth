package io.github.sephnescence.learningspringboot3ch4.oauth;

public record SearchResult(
        String kind,
        String etag,
        SearchId id,
        SearchSnippet snippet
) {
}
