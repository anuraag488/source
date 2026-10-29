package p000;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qu1 implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f28808a;

    /* JADX INFO: renamed from: b */
    public final Type f28809b;

    /* JADX INFO: renamed from: c */
    public final Type[] f28810c;

    public qu1(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            wb1.m12195o(cls, "Must specify owner type for ");
            throw null;
        }
        this.f28808a = type != null ? qs5.m10109n(type) : null;
        this.f28809b = qs5.m10109n(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f28810c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f28810c[i]);
            qs5.m10110o(this.f28810c[i]);
            Type[] typeArr3 = this.f28810c;
            typeArr3[i] = qs5.m10109n(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && qs5.m10117v(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f28810c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f28808a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f28809b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f28810c) ^ this.f28809b.hashCode();
        Type type = this.f28808a;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f28810c;
        int length = typeArr.length;
        Type type = this.f28809b;
        if (length == 0) {
            return qs5.m10093R(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(qs5.m10093R(type));
        sb.append("<");
        sb.append(qs5.m10093R(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(qs5.m10093R(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
