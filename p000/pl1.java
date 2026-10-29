package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pl1 extends xq1 implements mq1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f27726b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f27726b = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        boolean zM8794a;
        boolean zM8794a2;
        byte b = this.f27726b;
        qh2 qh2Var = null;
        byte b2 = 0;
        ju4 ju4Var = ju4.f22634a;
        Object obj3 = this.receiver;
        switch (b) {
            case 0:
                nl1 nl1Var = (nl1) obj;
                nl1 nl1Var2 = (nl1) obj2;
                ql1 ql1Var = (ql1) obj3;
                if (ql1Var.f25208n && (zM8794a = nl1Var2.m8794a()) != nl1Var.m8794a()) {
                    if (!zM8794a) {
                        qh2 qh2Var2 = ql1Var.f28552r;
                        if (qh2Var2 != null) {
                            qh2Var2.m9888b();
                        }
                        ql1Var.f28552r = null;
                    } else {
                        ql3 ql3Var = new ql3();
                        C0675g4 c0675g4 = new C0675g4((byte) 27);
                        c0675g4.f19600b = ql3Var;
                        c0675g4.f19601c = ql1Var;
                        VarHandle.storeStoreFence();
                        c20.m3797B(ql1Var, c0675g4);
                        qh2 qh2Var3 = (qh2) ql3Var.f28555a;
                        if (qh2Var3 != null) {
                            qh2Var3.m9887a();
                            qh2Var = qh2Var3;
                        }
                        ql1Var.f28552r = qh2Var;
                    }
                }
                break;
            case 1:
                nl1 nl1Var3 = (nl1) obj;
                nl1 nl1Var4 = (nl1) obj2;
                xl1 xl1Var = (xl1) obj3;
                if (xl1Var.f25208n && (zM8794a2 = nl1Var4.m8794a()) != nl1Var3.m8794a()) {
                    yp1 yp1Var = xl1Var.f34381r;
                    if (yp1Var != null) {
                        yp1Var.invoke(Boolean.valueOf(zM8794a2));
                    }
                    if (zM8794a2) {
                        lb5.m7910S(xl1Var.m8391C0(), null, cp0.f16328d, new C0982og((Object) xl1Var, (wm0) (b2 == true ? 1 : 0), (byte) 8), 1);
                        ql3 ql3Var2 = new ql3();
                        C0675g4 c0675g5 = new C0675g4((byte) 29);
                        c0675g5.f19600b = ql3Var2;
                        c0675g5.f19601c = xl1Var;
                        VarHandle.storeStoreFence();
                        c20.m3797B(xl1Var, c0675g5);
                        qh2 qh2Var4 = (qh2) ql3Var2.f28555a;
                        if (qh2Var4 != null) {
                            qh2Var4.m9887a();
                        } else {
                            qh2Var4 = null;
                        }
                        xl1Var.f34383t = qh2Var4;
                        e13 e13Var = xl1Var.f34384u;
                        if (e13Var != null && e13Var.mo4871Z0().f25208n) {
                            xl1Var.m12706S0();
                        }
                    } else {
                        qh2 qh2Var5 = xl1Var.f34383t;
                        if (qh2Var5 != null) {
                            qh2Var5.m9888b();
                        }
                        xl1Var.f34383t = null;
                        xl1Var.m12706S0();
                    }
                    y70.m13004E(xl1Var);
                    nv2 nv2Var = xl1Var.f34380q;
                    if (nv2Var != null) {
                        rk1 rk1Var = xl1Var.f34382s;
                        if (zM8794a2) {
                            if (rk1Var != null) {
                                xl1Var.m12705R0(nv2Var, new sk1(rk1Var));
                                xl1Var.f34382s = null;
                            }
                            rk1 rk1Var2 = new rk1();
                            xl1Var.m12705R0(nv2Var, rk1Var2);
                            xl1Var.f34382s = rk1Var2;
                        } else if (rk1Var != null) {
                            xl1Var.m12705R0(nv2Var, new sk1(rk1Var));
                            xl1Var.f34382s = null;
                        }
                    }
                }
                break;
            case 2:
                int iIntValue = ((Number) obj2).intValue();
                ir1 ir1Var = (ir1) ((mi0) obj);
                ir1Var.m6885d0(422943426);
                ((ny2) obj3).m8898a(iIntValue & 14, ir1Var);
                ir1Var.m6912r(false);
                break;
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                ir1 ir1Var2 = (ir1) ((mi0) obj);
                ir1Var2.m6885d0(-1899402494);
                ((ny2) obj3).m8898a(iIntValue2 & 14, ir1Var2);
                ir1Var2.m6912r(false);
                break;
        }
        return ju4Var;
    }
}
