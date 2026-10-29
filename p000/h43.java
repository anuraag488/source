package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h43 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ sl1 f20381a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sl1 f20382b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sl1 f20383c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ byte f20384d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C1164t f20385e;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        sl1 sl1Var = this.f20381a;
        sl1 sl1Var2 = this.f20382b;
        sl1 sl1Var3 = this.f20383c;
        byte b = this.f20384d;
        C1164t c1164t = this.f20385e;
        InterfaceC0706gz interfaceC0706gz = (InterfaceC0706gz) obj;
        if (sl1Var != ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var2)).getFocusOwner()).m3620f()) {
            return Boolean.TRUE;
        }
        boolean zM12968f0 = y62.m12968f0(sl1Var2, sl1Var3, b, c1164t);
        Boolean boolValueOf = Boolean.valueOf(zM12968f0);
        if (zM12968f0 || !interfaceC0706gz.mo2992a()) {
            return boolValueOf;
        }
        return null;
    }
}
