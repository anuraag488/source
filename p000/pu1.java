package p000;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pu1 implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f27997a;

    public pu1(Type type) {
        Objects.requireNonNull(type);
        this.f27997a = qs5.m10109n(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && qs5.m10117v(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f27997a;
    }

    public final int hashCode() {
        return this.f27997a.hashCode();
    }

    public final String toString() {
        return qs5.m10093R(this.f27997a) + "[]";
    }
}
