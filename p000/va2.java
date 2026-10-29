package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class va2 extends aa2 implements Map<String, aa2>, cc2 {
    public static final ua2 Companion = new ua2();

    /* JADX INFO: renamed from: a */
    public final Map f32494a;

    public va2(Map map) {
        this.f32494a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ aa2 compute(String str, BiFunction<? super String, ? super aa2, ? extends aa2> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ aa2 computeIfAbsent(String str, Function<? super String, ? extends aa2> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ aa2 computeIfPresent(String str, BiFunction<? super String, ? super aa2, ? extends aa2> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f32494a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof aa2)) {
            return false;
        }
        return this.f32494a.containsValue((aa2) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, aa2>> entrySet() {
        return this.f32494a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return z62.m13387o(this.f32494a, obj);
    }

    @Override // java.util.Map
    public final aa2 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (aa2) this.f32494a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f32494a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f32494a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f32494a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ aa2 merge(String str, aa2 aa2Var, BiFunction<? super aa2, ? super aa2, ? extends aa2> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ aa2 put(String str, aa2 aa2Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends aa2> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ aa2 putIfAbsent(String str, aa2 aa2Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final aa2 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ aa2 replace(String str, aa2 aa2Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super aa2, ? extends aa2> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f32494a.size();
    }

    public final String toString() {
        return hb0.m6305Q0(this.f32494a.entrySet(), ",", "{", "}", 0, new el1((byte) 17), 24);
    }

    @Override // java.util.Map
    public final Collection<aa2> values() {
        return this.f32494a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, aa2 aa2Var, aa2 aa2Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
