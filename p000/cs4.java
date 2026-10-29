package p000;

import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class cs4<T> {

    /* JADX INFO: renamed from: a */
    public final Class f16429a;

    /* JADX INFO: renamed from: b */
    public final Type f16430b;

    /* JADX INFO: renamed from: c */
    public final int f16431c;

    public cs4(Type type) {
        Objects.requireNonNull(type);
        Type typeM10109n = qs5.m10109n(type);
        this.f16430b = typeM10109n;
        this.f16429a = qs5.m10080E(typeM10109n);
        this.f16431c = typeM10109n.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cs4) {
            return qs5.m10117v(this.f16430b, ((cs4) obj).f16430b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16431c;
    }

    public final String toString() {
        return qs5.m10093R(this.f16430b);
    }
}
