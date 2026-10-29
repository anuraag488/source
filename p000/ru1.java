package p000;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ru1 implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f29637a;

    /* JADX INFO: renamed from: b */
    public final Type f29638b;

    public ru1(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            C1077qn.m9987m("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            C1077qn.m9987m("Exactly one upper bound must be specified");
            throw null;
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            qs5.m10110o(typeArr[0]);
            this.f29638b = null;
            this.f29637a = qs5.m10109n(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        qs5.m10110o(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            C1077qn.m9987m("When lower bound is specified, upper bound must be Object");
            throw null;
        }
        this.f29638b = qs5.m10109n(typeArr2[0]);
        this.f29637a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && qs5.m10117v(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f29638b;
        return type != null ? new Type[]{type} : qs5.f28774g;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f29637a};
    }

    public final int hashCode() {
        Type type = this.f29638b;
        return (this.f29637a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f29638b;
        if (type != null) {
            return "? super " + qs5.m10093R(type);
        }
        Type type2 = this.f29637a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + qs5.m10093R(type2);
    }
}
