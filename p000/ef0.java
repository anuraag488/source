package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 implements wm0 {

    /* JADX INFO: renamed from: b */
    public static final ef0 f18040b = new ef0(0);

    /* JADX INFO: renamed from: c */
    public static final ef0 f18041c = new ef0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18042a;

    public /* synthetic */ ef0(byte b) {
        this.f18042a = b;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        switch (this.f18042a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return r71.f29063a;
        }
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        switch (this.f18042a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f18042a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m5106a(Object obj) {
    }
}
