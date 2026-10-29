package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zq3 extends tf2 {

    /* JADX INFO: renamed from: c */
    public static final zq3 f36266c = new zq3("Undefined intrinsics block and it is required", 0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f36267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zq3(String str, byte b) {
        super(str);
        this.f36267b = b;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        switch (this.f36267b) {
            case 0:
                int size = list.size();
                Map map = w71.f33134a;
                if (size == 0) {
                    return zq2Var.mo3583l0(kl0.m7541k(j), kl0.m7540j(j), map, new t63((byte) 9));
                }
                if (size == 1) {
                    db3 db3VarMo5826e = ((sq2) list.get(0)).mo5826e(j);
                    int iM8015g = ll0.m8015g(db3VarMo5826e.f16899a, j);
                    int iM8014f = ll0.m8014f(db3VarMo5826e.f16900b, j);
                    C0830kc c0830kc = new C0830kc((byte) 11);
                    c0830kc.f23061b = db3VarMo5826e;
                    VarHandle.storeStoreFence();
                    return zq2Var.mo3583l0(iM8015g, iM8014f, map, c0830kc);
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    db3 db3VarMo5826e2 = ((sq2) list.get(i)).mo5826e(j);
                    iMax = Math.max(db3VarMo5826e2.f16899a, iMax);
                    iMax2 = Math.max(db3VarMo5826e2.f16900b, iMax2);
                    arrayList.add(db3VarMo5826e2);
                }
                int iM8015g2 = ll0.m8015g(iMax, j);
                int iM8014f2 = ll0.m8014f(iMax2, j);
                yq3 yq3Var = new yq3((byte) 0);
                yq3Var.f35462b = arrayList;
                VarHandle.storeStoreFence();
                return zq2Var.mo3583l0(iM8015g2, iM8014f2, map, yq3Var);
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
