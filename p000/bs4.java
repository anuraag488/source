package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bs4 {

    /* JADX INFO: renamed from: a */
    public r90 f15554a;

    /* JADX INFO: renamed from: b */
    public List f15555b;

    /* JADX INFO: renamed from: c */
    public boolean f15556c;

    /* JADX INFO: renamed from: a */
    public final String m3666a(boolean z) {
        String name;
        String strM6305Q0;
        List list = this.f15555b;
        boolean z2 = this.f15556c;
        r90 r90Var = this.f15554a;
        Class cls = r90Var.f29101a;
        if (!cls.isArray()) {
            name = (z && cls.isPrimitive()) ? oh6.m9114t(r90Var).getName() : cls.getName();
        } else if (cls.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (cls.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (cls.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (cls.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (cls.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (cls.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (cls.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = cls.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        if (list.isEmpty()) {
            strM6305Q0 = "";
        } else {
            ro4 ro4Var = new ro4((byte) 3);
            VarHandle.storeStoreFence();
            strM6305Q0 = hb0.m6305Q0(list, ", ", "<", ">", 0, ro4Var, 24);
        }
        return zi4.m13621u(name, strM6305Q0, z2 ? "?" : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bs4)) {
            return false;
        }
        bs4 bs4Var = (bs4) obj;
        return this.f15554a.equals(bs4Var.f15554a) && z62.m13387o(this.f15555b, bs4Var.f15555b) && this.f15556c == bs4Var.f15556c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15556c ? 1 : 0) + ((this.f15555b.hashCode() + (this.f15554a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return m3666a(false).concat(" (Kotlin reflection is not available)");
    }
}
