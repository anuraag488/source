package p000;

import android.util.Log;

/* JADX INFO: renamed from: rh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1108rh extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f29277t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f29278u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1108rh(int i, wm0 wm0Var, byte b) {
        super(i, wm0Var);
        this.f29277t = b;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f29277t) {
            case 0:
                C1108rh c1108rh = new C1108rh(2, wm0Var, (byte) 0);
                c1108rh.f29278u = obj;
                return c1108rh;
            case 1:
                C1108rh c1108rh2 = new C1108rh(2, wm0Var, (byte) 1);
                c1108rh2.f29278u = obj;
                return c1108rh2;
            case 2:
                C1108rh c1108rh3 = new C1108rh(2, wm0Var, (byte) 2);
                c1108rh3.f29278u = obj;
                return c1108rh3;
            case 3:
                C1108rh c1108rh4 = new C1108rh(2, wm0Var, (byte) 3);
                c1108rh4.f29278u = obj;
                return c1108rh4;
            case 4:
                C1108rh c1108rh5 = new C1108rh(2, wm0Var, (byte) 4);
                c1108rh5.f29278u = obj;
                return c1108rh5;
            case 5:
                C1108rh c1108rh6 = new C1108rh(2, wm0Var, (byte) 5);
                c1108rh6.f29278u = obj;
                return c1108rh6;
            default:
                C1108rh c1108rh7 = new C1108rh(2, wm0Var, (byte) 6);
                c1108rh7.f29278u = obj;
                return c1108rh7;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29277t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1108rh) create((wm0) obj2, (ag0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C1108rh) create((wm0) obj2, (wb4) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C1108rh) create((wm0) obj2, (ag0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C1108rh) create((wm0) obj2, (ag0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C1108rh) create((wm0) obj2, (cl3) obj)).invokeSuspend(ju4Var);
            case 5:
                ((C1108rh) create((wm0) obj2, (String) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            default:
                return ((C1108rh) create((wm0) obj2, (j54) obj)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        switch (this.f29277t) {
            case 0:
                ag0 ag0Var = (ag0) this.f29278u;
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(ag0Var != null);
            case 1:
                wb4 wb4Var = (wb4) this.f29278u;
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(!(wb4Var instanceof yf1));
            case 2:
                ag0 ag0Var2 = (ag0) this.f29278u;
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(ag0Var2 != null);
            case 3:
                ag0 ag0Var3 = (ag0) this.f29278u;
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(ag0Var3 != null);
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(((cl3) this.f29278u) == cl3.f16099a);
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                k43.m7376J(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f29278u));
                return ju4.f22634a;
            default:
                j54 j54Var = (j54) this.f29278u;
                ap0 ap0Var7 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(j54Var != j54.f22029a);
        }
    }
}
