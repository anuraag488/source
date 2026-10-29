package p000;

/* JADX INFO: renamed from: jm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0803jm extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22413t;

    /* JADX INFO: renamed from: u */
    public byte f22414u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ u93 f22415v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ xz4 f22416w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ g44 f22417x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0803jm(u93 u93Var, xz4 xz4Var, g44 g44Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f22413t = b;
        this.f22415v = u93Var;
        this.f22416w = xz4Var;
        this.f22417x = g44Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f22413t;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                return new C0803jm(this.f22415v, this.f22416w, this.f22417x, wm0Var, (byte) 0).invokeSuspend(ju4Var);
            case 1:
                return new C0803jm(this.f22415v, this.f22416w, this.f22417x, wm0Var, (byte) 1).invokeSuspend(ju4Var);
            default:
                return new C0803jm(this.f22415v, this.f22416w, this.f22417x, wm0Var, (byte) 2).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r11 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cb, code lost:
    
        if (r11 == r0) goto L58;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte b = this.f22413t;
        boolean z = false;
        g44 g44Var = this.f22417x;
        xz4 xz4Var = this.f22416w;
        u93 u93Var = this.f22415v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f22414u;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    this.f22414u = (byte) 1;
                    obj = u93Var.mo11771c(this);
                    if (obj != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b2 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                C0766im c0766im = (C0766im) obj;
                g44Var.setValue(c0766im != null ? c0766im.f21544a : null);
                if (obj != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
                if (((Boolean) obj).booleanValue()) {
                    pg0 pg0Var = AbstractC1356y5.f34880c;
                    this.f22414u = (byte) 2;
                    obj = la1.m7886b(xz4Var, pg0Var, this);
                    break;
                }
                return Boolean.valueOf(z);
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f22414u;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    this.f22414u = (byte) 1;
                    obj = u93Var.mo11771c(this);
                    if (obj != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (b3 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b3 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                g44Var.setValue((lr2) obj);
                if (obj != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
                if (((Boolean) obj).booleanValue()) {
                    pg0 pg0Var2 = kx5.f23591c;
                    this.f22414u = (byte) 2;
                    obj = la1.m7886b(xz4Var, pg0Var2, this);
                    break;
                }
                return Boolean.valueOf(z);
            default:
                ap0 ap0Var3 = ap0.f14763a;
                byte b4 = this.f22414u;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    this.f22414u = (byte) 1;
                    obj = u93Var.mo11771c(this);
                    if (obj != ap0Var3) {
                    }
                    return ap0Var3;
                }
                if (b4 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b4 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                g44Var.setValue((ea3) obj);
                if (obj != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
                if (((Boolean) obj).booleanValue()) {
                    pg0 pg0Var3 = c20.f15764f;
                    this.f22414u = (byte) 2;
                    obj = la1.m7886b(xz4Var, pg0Var3, this);
                    break;
                }
                return Boolean.valueOf(z);
        }
    }
}
