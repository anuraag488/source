package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: tf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1180tf implements xq2 {

    /* JADX INFO: renamed from: b */
    public static final C1180tf f31100b = new C1180tf(0);

    /* JADX INFO: renamed from: c */
    public static final C1180tf f31101c = new C1180tf(1);

    /* JADX INFO: renamed from: d */
    public static final C1180tf f31102d = new C1180tf(2);

    /* JADX INFO: renamed from: e */
    public static final C1180tf f31103e = new C1180tf(3);

    /* JADX INFO: renamed from: f */
    public static final dh0 f31104f = new dh0((byte) 13);

    /* JADX INFO: renamed from: g */
    public static final C1180tf f31105g = new C1180tf(4);

    /* JADX INFO: renamed from: h */
    public static final C1180tf f31106h = new C1180tf(5);

    /* JADX INFO: renamed from: i */
    public static final C1180tf f31107i = new C1180tf(6);

    /* JADX INFO: renamed from: j */
    public static final C1180tf f31108j = new C1180tf(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31109a;

    public /* synthetic */ C1180tf(byte b) {
        this.f31109a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        byte b = this.f31109a;
        byte b2 = 5;
        byte b3 = 0;
        byte b4 = 1;
        Map map = w71.f33134a;
        switch (b) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    return zq2Var.mo3583l0(0, 0, map, C1106rf.f29215b);
                }
                if (size == 1) {
                    db3 db3VarMo5826e = ((sq2) list.get(0)).mo5826e(j);
                    int i = db3VarMo5826e.f16899a;
                    int i2 = db3VarMo5826e.f16900b;
                    C1143sf c1143sf = new C1143sf(b3);
                    c1143sf.f30223b = db3VarMo5826e;
                    VarHandle.storeStoreFence();
                    return zq2Var.mo3583l0(i, i2, map, c1143sf);
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (b3 < size2) {
                    db3 db3VarMo5826e2 = ((sq2) list.get(b3)).mo5826e(j);
                    iMax = Math.max(iMax, db3VarMo5826e2.f16899a);
                    iMax2 = Math.max(iMax2, db3VarMo5826e2.f16900b);
                    arrayList.add(db3VarMo5826e2);
                    b3++;
                }
                C1143sf c1143sf2 = new C1143sf(b4);
                c1143sf2.f30223b = arrayList;
                VarHandle.storeStoreFence();
                return zq2Var.mo3583l0(iMax, iMax2, map, c1143sf2);
            case 1:
                return zq2Var.mo3583l0(kl0.m7541k(j), kl0.m7540j(j), map, new t25(b4));
            case 2:
                return zq2Var.mo3583l0(kl0.m7541k(j), kl0.m7540j(j), map, new C0499bp(b2));
            case 3:
                return zq2Var.mo3583l0(kl0.m7539i(j), kl0.m7538h(j), map, f31104f);
            case 4:
                return zq2Var.mo3583l0(kl0.m7541k(j), kl0.m7540j(j), map, new el1((byte) 9));
            case 5:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i3 = 0; i3 < size3; i3++) {
                    db3 db3VarMo5826e3 = ((sq2) list.get(i3)).mo5826e(j);
                    iMax3 = Math.max(iMax3, db3VarMo5826e3.f16899a);
                    iMax4 = Math.max(iMax4, db3VarMo5826e3.f16900b);
                    arrayList2.add(db3VarMo5826e3);
                }
                yq3 yq3Var = new yq3((byte) 1);
                yq3Var.f35462b = arrayList2;
                VarHandle.storeStoreFence();
                return zq2Var.mo3583l0(iMax3, iMax4, map, yq3Var);
            case 6:
                return zq2Var.mo3583l0(kl0.m7537g(j) ? kl0.m7539i(j) : 0, kl0.m7536f(j) ? kl0.m7538h(j) : 0, map, new r54((byte) 4));
            default:
                return zq2Var.mo3583l0(kl0.m7541k(j), kl0.m7540j(j), map, new r54((byte) 5));
        }
    }
}
