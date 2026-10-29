package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k22 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22832t;

    /* JADX INFO: renamed from: u */
    public boolean f22833u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ l22 f22834v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k22(l22 l22Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f22832t = b;
        this.f22834v = l22Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f22832t;
        l22 l22Var = this.f22834v;
        switch (b) {
            case 0:
                return new k22(l22Var, wm0Var, (byte) 0);
            case 1:
                return new k22(l22Var, wm0Var, (byte) 1);
            default:
                return new k22(l22Var, wm0Var, (byte) 2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22832t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((k22) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f22832t;
        l22 l22Var = this.f22834v;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f22833u;
                if (!z) {
                    k43.m7376J(obj);
                    C0910mi c0910mi = l22Var.f23733D;
                    if (c0910mi != null) {
                        Float f = new Float(((Number) c0910mi.m8328d()).floatValue() + 1080.0f);
                        bs0 bs0Var = eh3.f18092a;
                        e32 e32VarM10037u = qq2.m10037u(qq2.m10016K(6000, 0, h51.f20398c, 2), 6);
                        C0777ix c0777ix = new C0777ix((byte) 2);
                        c0777ix.f21854b = l22Var;
                        VarHandle.storeStoreFence();
                        this.f22833u = true;
                        if (C0910mi.m8325a(c0910mi, f, e32VarM10037u, c0777ix, this, 4) == ap0Var) {
                            return ap0Var;
                        }
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f22833u;
                if (!z2) {
                    k43.m7376J(obj);
                    C0910mi c0910mi2 = l22Var.f23734E;
                    if (c0910mi2 != null) {
                        Float f2 = new Float(((Number) c0910mi2.m8328d()).floatValue() + 360.0f);
                        bs0 bs0Var2 = eh3.f18092a;
                        t63 t63Var = new t63((byte) 5);
                        qd2 qd2Var = new qd2();
                        qd2Var.f28397a = (short) 300;
                        lv2 lv2Var = n52.f25469a;
                        qd2Var.f28398b = new lv2();
                        t63Var.invoke(qd2Var);
                        rd2 rd2Var = new rd2();
                        rd2Var.f29184a = qd2Var;
                        VarHandle.storeStoreFence();
                        e32 e32VarM10037u2 = qq2.m10037u(rd2Var, 6);
                        C0777ix c0777ix2 = new C0777ix((byte) 3);
                        c0777ix2.f21854b = l22Var;
                        VarHandle.storeStoreFence();
                        this.f22833u = true;
                        if (C0910mi.m8325a(c0910mi2, f2, e32VarM10037u2, c0777ix2, this, 4) == ap0Var2) {
                            return ap0Var2;
                        }
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f22833u;
                if (!z3) {
                    k43.m7376J(obj);
                    C0910mi c0910mi3 = l22Var.f23735F;
                    if (c0910mi3 != null) {
                        Float f3 = new Float(((Number) c0910mi3.m8328d()).floatValue() < 0.485f ? 0.87f : 0.1f);
                        bs0 bs0Var3 = eh3.f18092a;
                        qd2 qd2Var2 = new qd2();
                        qd2Var2.f28397a = (short) 300;
                        lv2 lv2Var2 = n52.f25469a;
                        qd2Var2.f28398b = new lv2();
                        qd2Var2.f28397a = (short) 6000;
                        qd2Var2.m9862a(Float.valueOf(0.87f), 3000).f27534b = eh3.f18092a;
                        qd2Var2.m9862a(Float.valueOf(0.1f), 6000);
                        rd2 rd2Var2 = new rd2();
                        rd2Var2.f29184a = qd2Var2;
                        VarHandle.storeStoreFence();
                        e32 e32VarM10037u3 = qq2.m10037u(rd2Var2, 6);
                        C0777ix c0777ix3 = new C0777ix((byte) 4);
                        c0777ix3.f21854b = l22Var;
                        VarHandle.storeStoreFence();
                        this.f22833u = true;
                        if (C0910mi.m8325a(c0910mi3, f3, e32VarM10037u3, c0777ix3, this, 4) == ap0Var3) {
                            return ap0Var3;
                        }
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
        }
    }
}
