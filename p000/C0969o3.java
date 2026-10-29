package p000;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0969o3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f26310t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ boolean f26311u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0969o3(int i, wm0 wm0Var, byte b) {
        super(i, wm0Var);
        this.f26310t = b;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = 2;
        switch (this.f26310t) {
            case 0:
                C0969o3 c0969o3 = new C0969o3(b, wm0Var, (byte) 0);
                c0969o3.f26311u = ((Boolean) obj).booleanValue();
                return c0969o3;
            case 1:
                C0969o3 c0969o4 = new C0969o3(b, wm0Var, (byte) 1);
                c0969o4.f26311u = ((Boolean) obj).booleanValue();
                return c0969o4;
            case 2:
                C0969o3 c0969o5 = new C0969o3(b, wm0Var, b);
                c0969o5.f26311u = ((Boolean) obj).booleanValue();
                return c0969o5;
            case 3:
                C0969o3 c0969o6 = new C0969o3(b, wm0Var, (byte) 3);
                c0969o6.f26311u = ((Boolean) obj).booleanValue();
                return c0969o6;
            case 4:
                C0969o3 c0969o7 = new C0969o3(b, wm0Var, (byte) 4);
                c0969o7.f26311u = ((Boolean) obj).booleanValue();
                return c0969o7;
            case 5:
                C0969o3 c0969o8 = new C0969o3(b, wm0Var, (byte) 5);
                c0969o8.f26311u = ((Boolean) obj).booleanValue();
                return c0969o8;
            default:
                C0969o3 c0969o9 = new C0969o3(b, wm0Var, (byte) 6);
                c0969o9.f26311u = ((Boolean) obj).booleanValue();
                return c0969o9;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26310t;
        ju4 ju4Var = ju4.f22634a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((C0969o3) create(wm0Var, bool)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f26310t;
        boolean z = this.f26311u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(!z);
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(!z);
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(!z);
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(!z);
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(z);
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(z);
            default:
                ap0 ap0Var7 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(z);
        }
    }
}
