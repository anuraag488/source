package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pu4 {
    /* JADX INFO: renamed from: a */
    public static nu4 m9678a(Object obj) {
        tr1 tr1Var = (tr1) obj;
        nu4 nu4Var = tr1Var.unknownFields;
        if (nu4Var != nu4.f26097f) {
            return nu4Var;
        }
        nu4 nu4VarM8851c = nu4.m8851c();
        tr1Var.unknownFields = nu4VarM8851c;
        return nu4VarM8851c;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9679b(int i, xa0 xa0Var, Object obj) throws h72 {
        int i2 = xa0Var.f34092b;
        ta0 ta0Var = (ta0) xa0Var.f34095e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            xa0Var.m12593W(0);
            ((nu4) obj).m8854d(i3 << 3, Long.valueOf(ta0Var.m11005k()));
            return true;
        }
        if (i4 == 1) {
            xa0Var.m12593W(1);
            ((nu4) obj).m8854d((i3 << 3) | 1, Long.valueOf(ta0Var.m11003i()));
            return true;
        }
        if (i4 == 2) {
            ((nu4) obj).m8854d((i3 << 3) | 2, xa0Var.m12618n());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new h72("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw h72.m6265b();
            }
            xa0Var.m12593W(5);
            ((nu4) obj).m8854d(5 | (i3 << 3), Integer.valueOf(ta0Var.m11002h()));
            return true;
        }
        nu4 nu4VarM8851c = nu4.m8851c();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new h72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (xa0Var.m12598d() != Integer.MAX_VALUE && m9679b(i7, xa0Var, nu4VarM8851c)) {
        }
        if (i6 != xa0Var.f34092b) {
            throw new h72("Protocol message end-group tag did not match expected tag.");
        }
        if (nu4VarM8851c.f26102e) {
            nu4VarM8851c.f26102e = false;
        }
        ((nu4) obj).m8854d(i5 | 3, nu4VarM8851c);
        return true;
    }
}
