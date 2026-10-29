package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c26 extends s66 {
    private static final c26 zzb;
    private f76 zzd = ga6.f19693e;

    static {
        c26 c26Var = new c26();
        zzb = c26Var;
        s66.m10531f(c26.class, c26Var);
    }

    /* JADX INFO: renamed from: q */
    public static a26 m3834q() {
        return (a26) zzb.m10542k();
    }

    /* JADX INFO: renamed from: r */
    public static void m3835r(c26 c26Var, ArrayList arrayList) {
        f76 f76VarMo5612i = c26Var.zzd;
        if (!((y36) f76VarMo5612i).f34844a) {
            int size = f76VarMo5612i.size();
            f76VarMo5612i = f76VarMo5612i.mo5612i(size + size);
            c26Var.zzd = f76VarMo5612i;
        }
        int size2 = arrayList.size();
        if (f76VarMo5612i instanceof ArrayList) {
            ((ArrayList) f76VarMo5612i).ensureCapacity(f76VarMo5612i.size() + size2);
        } else if (f76VarMo5612i instanceof ga6) {
            ga6 ga6Var = (ga6) f76VarMo5612i;
            int i = ga6Var.f19695c + size2;
            int length = ga6Var.f19694b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = zi4.m13610j(length, 3, 2, 1, 10);
                    }
                    ga6Var.f19694b = Arrays.copyOf(ga6Var.f19694b, length);
                } else {
                    ga6Var.f19694b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = f76VarMo5612i.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strM3878j = c75.m3878j("Element at index ", f76VarMo5612i.size() - size3, " is null.");
                int size5 = f76VarMo5612i.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        xy4.m12782k(strM3878j);
                        return;
                    }
                    f76VarMo5612i.remove(size5);
                }
            } else {
                f76VarMo5612i.add(obj);
            }
        }
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", y16.class});
        }
        if (i2 == 3) {
            return new c26();
        }
        if (i2 == 4) {
            return new a26(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
