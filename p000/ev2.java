package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ev2 {

    /* JADX INFO: renamed from: a */
    public lw2 f18514a;

    /* JADX INFO: renamed from: a */
    public static final void m5404a(lw2 lw2Var, Object obj, Object obj2) {
        int iM8131f = lw2Var.m8131f(obj);
        boolean z = iM8131f < 0;
        Object obj3 = z ? null : lw2Var.f24420c[iM8131f];
        if (obj3 != null) {
            if (obj3 instanceof cw2) {
                cw2 cw2Var = (cw2) obj3;
                cw2Var.m4200a(obj2);
                obj2 = cw2Var;
            } else {
                Object[] objArr = q23.f28158a;
                cw2 cw2Var2 = new cw2(2);
                cw2Var2.m4200a(obj3);
                cw2Var2.m4200a(obj2);
                obj2 = cw2Var2;
            }
        }
        if (!z) {
            lw2Var.f24420c[iM8131f] = obj2;
            return;
        }
        int i = ~iM8131f;
        lw2Var.f24419b[i] = obj;
        lw2Var.f24420c[i] = obj2;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m5405b(lw2 lw2Var, su2 su2Var) {
        Object objM8132g = lw2Var.m8132g(su2Var);
        if (objM8132g == null) {
            return null;
        }
        if (!(objM8132g instanceof cw2)) {
            lw2Var.m8136k(su2Var);
            return objM8132g;
        }
        cw2 cw2Var = (cw2) objM8132g;
        if (cw2Var.m4208i()) {
            ds3.m4667k("List is empty.");
            return null;
        }
        int i = cw2Var.f16533b - 1;
        Object objM4206g = cw2Var.m4206g(i);
        cw2Var.m4211l(i);
        if (cw2Var.m4208i()) {
            lw2Var.m8136k(su2Var);
        }
        if (cw2Var.f16533b == 1) {
            lw2Var.m8138m(su2Var, cw2Var.m4205f());
        }
        return objM4206g;
    }

    /* JADX INFO: renamed from: c */
    public static final void m5406c(lw2 lw2Var, su2 su2Var, yp1 yp1Var) {
        Object objM8132g = lw2Var.m8132g(su2Var);
        if (objM8132g != null) {
            if (!(objM8132g instanceof cw2)) {
                if (((Boolean) yp1Var.invoke(objM8132g)).booleanValue()) {
                    lw2Var.m8136k(su2Var);
                    return;
                }
                return;
            }
            cw2 cw2Var = (cw2) objM8132g;
            int i = cw2Var.f16533b;
            Object[] objArr = cw2Var.f16532a;
            int i2 = 0;
            r52 r52VarM10660c0 = sc6.m10660c0(0, i);
            int i3 = r52VarM10660c0.f27382a;
            int i4 = r52VarM10660c0.f27383b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) yp1Var.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            Arrays.fill(objArr, i - i2, i, (Object) null);
            cw2Var.f16533b -= i2;
            if (cw2Var.m4208i()) {
                lw2Var.m8136k(su2Var);
            }
            if (cw2Var.f16533b == 1) {
                lw2Var.m8138m(su2Var, cw2Var.m4205f());
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ev2) && this.f18514a.equals(((ev2) obj).f18514a);
    }

    public final int hashCode() {
        return this.f18514a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f18514a + ")";
    }
}
