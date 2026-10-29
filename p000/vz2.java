package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vz2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32983a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ny2 f32984b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ xz2 f32985c;

    public /* synthetic */ vz2(byte b) {
        this.f32983a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        byte b = this.f32983a;
        ju4 ju4Var = ju4.f22634a;
        i50 i50Var = ki0.f23136a;
        switch (b) {
            case 0:
                ny2 ny2Var = this.f32984b;
                xz2 xz2Var = this.f32985c;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    Map map = (Map) ir1Var.m6898k((xh3) zz2.f36503b.m9574l(null, zz2.f36502a[0]));
                    boolean zM6890g = ir1Var.m6890g(ny2Var) | ir1Var.m6890g(xz2Var) | ir1Var.m6894i(map);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj3 = objM6869O;
                        C1164t c1164t = new C1164t((byte) 23);
                        c1164t.f30700c = map;
                        c1164t.f30699b = ny2Var;
                        c1164t.f30701d = xz2Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c1164t);
                        obj3 = c1164t;
                    }
                    lb5.m7923d(ju4Var, (yp1) obj3, ir1Var);
                }
                break;
            default:
                ny2 ny2Var2 = this.f32984b;
                xz2 xz2Var2 = this.f32985c;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    kr3 kr3Var = (kr3) ny2Var2.f26195b;
                    pz2 pz2Var = (pz2) ir1Var2.m6898k(rz2.m10508a());
                    Object objM6869O2 = ir1Var2.m6869O();
                    if (objM6869O2 == i50Var) {
                        obj4 = objM6869O2;
                        wz2 wz2Var = new wz2();
                        wz2Var.f33873a = xz2Var2;
                        wz2Var.f33874b = pz2Var;
                        wz2Var.f33875c = kr3Var;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(wz2Var);
                        obj4 = wz2Var;
                    }
                    obj4 = objM6869O2;
                    zh3 zh3VarMo7523a = a64.f143a.mo7523a((wz2) obj4);
                    boolean zM6890g2 = ir1Var2.m6890g(ny2Var2);
                    Object objM6869O3 = ir1Var2.m6869O();
                    if (zM6890g2 || objM6869O3 == i50Var) {
                        pl1 pl1Var = new pl1(2, ny2Var2, ny2.class, "Content", "Content(Landroidx/compose/runtime/Composer;I)V", 0, (byte) 3);
                        ir1Var2.m6905n0(pl1Var);
                        objM6869O3 = pl1Var;
                    }
                    as4.m3244c(zh3VarMo7523a, (mq1) ((xq1) objM6869O3), ir1Var2, 8);
                }
                break;
        }
        return ju4Var;
    }
}
