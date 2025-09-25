package ch.juventus.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MapFilterTest {

    private MapFilter mapFilter;

    @BeforeEach
    void setUp() {
        mapFilter = new MapFilter();
    }

    @Test
    @DisplayName("Filter using v1 of the cleanup method")
    void filterV1() {
        // given
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "abc");
        map.put(4, "def");
        map.put(5, "abc");

        // when
        Map<Integer, String> filteredMap = mapFilter.cleanupV1(map, "abc");

        // then
        assertEquals(3,  filteredMap.size());
        assertTrue(filteredMap.values().containsAll(List.of("abc", "abc", "abc")));
        assertTrue(filteredMap.keySet().containsAll(Set.of(1, 3, 5)));
    }

    @Test
    @DisplayName("Passing null to the v1 cleanup method")
    void filterV1PassingNull() {
        // when
        Map<Integer, String> filteredMap = mapFilter.cleanupV1(null, "abc");

        // then
        assertEquals(0,  filteredMap.size());
    }

    @Test
    @DisplayName("Filter using v2 of the cleanup method")
    void filterV2() {
        // given
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "abc");
        map.put(4, "def");
        map.put(5, "abc");

        // when
        Map<Integer, String> filteredMap = mapFilter.cleanupV2(map, "abc");

        // then
        assertEquals(3,  filteredMap.size());
        assertTrue(filteredMap.values().containsAll(List.of("abc", "abc", "abc")));
        assertTrue(filteredMap.keySet().containsAll(Set.of(1, 3, 5)));
    }

    @Test
    @DisplayName("Filter using v3 of the cleanup method")
    void filterV3() {
        // given
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "abc");
        map.put(4, "def");
        map.put(5, "abc");

        // when
        Map<Integer, String> filteredMap = mapFilter.cleanupV3(map, "abc");

        // then
        assertEquals(3,  filteredMap.size());
        assertTrue(filteredMap.values().containsAll(List.of("abc", "abc", "abc")));
        assertTrue(filteredMap.keySet().containsAll(Set.of(1, 3, 5)));
    }

}