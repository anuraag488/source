package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i22 extends xq1 implements qq1 {
    @Override // p000.qq1
    /* JADX INFO: renamed from: c */
    public final Object mo6204c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ir3 ir3Var;
        float fFloatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        ((Number) obj3).floatValue();
        long j = ((h74) obj4).f20418a;
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        C0489bf c0489bf = (C0489bf) obj6;
        o90 o90Var = ((l22) this.receiver).f23746x;
        cu2 cu2Var = o90Var.f26476e;
        if (cu2Var == null) {
            if (fFloatValue == 1.0f && (ir3Var = o90Var.f26475d) != null) {
                AbstractC0647fd.m5659Q(ir3Var, c0489bf, zBooleanValue, 10);
                return c0489bf;
            }
            ir3 ir3Var2 = o90Var.f26474c;
            if (ir3Var2 != null) {
                AbstractC0647fd.m5659Q(ir3Var2, c0489bf, zBooleanValue, 10);
            }
            return c0489bf;
        }
        sl2 sl2VarM7680G = kx5.m7680G();
        ArrayList arrayList = cu2Var.f16495a;
        int size = arrayList.size();
        as0 as0Var = null;
        int i = 0;
        as0 as0Var2 = null;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = ew4.m5414b(((as0) ((l73) arrayList.get(i)).f23833a).f14841a[i2], ((as0) ((l73) arrayList.get(i)).f23834b).f14841a[i2], fFloatValue);
            }
            as0 as0Var3 = new as0(fArr);
            if (as0Var2 == null) {
                as0Var2 = as0Var3;
            }
            if (as0Var != null) {
                sl2VarM7680G.add(as0Var);
            }
            i++;
            as0Var = as0Var3;
        }
        if (as0Var != null && as0Var2 != null) {
            float[] fArr2 = as0Var.f14841a;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[2];
            float f4 = fArr2[3];
            float f5 = fArr2[4];
            float f6 = fArr2[5];
            float[] fArr3 = as0Var2.f14841a;
            sl2VarM7680G.add(y62.m12969g(f, f2, f3, f4, f5, f6, fArr3[0], fArr3[1]));
        }
        AbstractC0647fd.m5655M(c0489bf, zBooleanValue, kx5.m7740w(sl2VarM7680G), 0.5f, 0.5f);
        return c0489bf;
    }
}
