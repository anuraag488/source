package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q60 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28235a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f28236b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f28237c;

    public /* synthetic */ q60(byte b) {
        this.f28235a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f28235a) {
            case 0:
                jp0 jp0Var = (jp0) this.f28237c;
                int i = this.f28236b;
                b70 b70Var = (b70) jp0Var.f22481b;
                vt1 vt1Var = (vt1) jp0Var.f22482c;
                if (i == -4) {
                    str = "Font was not loaded due to security issues. This usually means the font was attempted to load in a restricted context";
                } else if (i == -3) {
                    str = "Generic error loading font, for example variation settings were not parsable";
                } else if (i == -2) {
                    str = "The given provider cannot be authenticated with the certificates given.";
                } else if (i == -1) {
                    str = "The requested provider was not found on this device.";
                } else if (i == 1) {
                    str = "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml";
                } else if (i != 2) {
                    str = i != 3 ? "Unknown error code" : "The given query was not supported by this provider.";
                } else {
                    str = "The provider found the queried font, but it is currently unavailable.";
                }
                StringBuilder sb = new StringBuilder("Failed to load ");
                sb.append(vt1Var);
                sb.append(" (reason=");
                sb.append(i);
                sb.append(", ");
                b70Var.mo115m(new IllegalStateException(zi4.m13623w(sb, str, ")")));
                break;
            case 1:
                ((is0) this.f28237c).f21736b.onNavigationEvent(this.f28236b);
                break;
            case 2:
                ((ol5) this.f28237c).m9174f(this.f28236b);
                break;
            default:
                ((px4) this.f28237c).onStatus(this.f28236b);
                break;
        }
    }
}
