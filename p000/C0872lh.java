package p000;

import ads_mobile_sdk.C0131g8;
import ads_mobile_sdk.mc0;
import android.os.Debug;
import android.view.Choreographer;

/* JADX INFO: renamed from: lh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0872lh extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f24028t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0872lh(int i, wm0 wm0Var, byte b) {
        super(i, wm0Var);
        this.f24028t = b;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = 2;
        switch (this.f24028t) {
            case 0:
                return new C0872lh(b, wm0Var, (byte) 0);
            case 1:
                return new C0872lh(b, wm0Var, (byte) 1);
            case 2:
                return new C0872lh(b, wm0Var, b);
            case 3:
                return new C0872lh(b, wm0Var, (byte) 3);
            case 4:
                return new C0872lh(b, wm0Var, (byte) 4);
            case 5:
                return new C0872lh(b, wm0Var, (byte) 5);
            case 6:
                return new C0872lh(b, wm0Var, (byte) 6);
            case 7:
                return new C0872lh(b, wm0Var, (byte) 7);
            case 8:
                return new C0872lh(b, wm0Var, (byte) 8);
            case 9:
                return new C0872lh(b, wm0Var, (byte) 9);
            default:
                return new C0872lh(b, wm0Var, (byte) 10);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24028t;
        int i = 2;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0872lh) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                ((C0872lh) create((wm0) obj2, (C0766im) obj)).invokeSuspend(ju4Var);
                return Boolean.TRUE;
            case 2:
                ((C0872lh) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                throw null;
            case 3:
                ((C0872lh) create((wm0) obj2, (si1) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 4:
                return ((C0872lh) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                ((C0872lh) create((wm0) obj2, (tx3) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 6:
                ((C0872lh) create((wm0) obj2, (ti1) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 7:
                new C0872lh(i, (wm0) obj2, (byte) 7);
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(ju4Var);
                return ju4Var;
            case 8:
                return new C0872lh(i, (wm0) obj2, (byte) 8).invokeSuspend(ju4Var);
            case 9:
                new C0872lh(i, (wm0) obj2, (byte) 9);
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(ju4Var);
                return ju4Var;
            default:
                return new C0872lh(i, (wm0) obj2, (byte) 10).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f24028t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                return Choreographer.getInstance();
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.TRUE;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                throw new RuntimeException("Force crash");
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                return ju4Var;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                k43.m7376J(obj);
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                return memoryInfo.getMemoryStats();
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                k43.m7376J(obj);
                return ju4Var;
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                k43.m7376J(obj);
                return ju4Var;
            case 7:
                ap0 ap0Var8 = ap0.f14763a;
                k43.m7376J(obj);
                return ju4Var;
            case 8:
                ap0 ap0Var9 = ap0.f14763a;
                k43.m7376J(obj);
                return C0131g8.m1016v();
            case 9:
                ap0 ap0Var10 = ap0.f14763a;
                k43.m7376J(obj);
                return ju4Var;
            default:
                ap0 ap0Var11 = ap0.f14763a;
                k43.m7376J(obj);
                return mc0.m1714w();
        }
    }
}
