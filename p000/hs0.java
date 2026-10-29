package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20823a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ is0 f20824b;

    public /* synthetic */ hs0(byte b) {
        this.f20823a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20823a) {
            case 0:
                this.f20824b.f21736b.getClass();
                break;
            case 1:
                this.f20824b.f21736b.extraCallback();
                break;
            case 2:
                this.f20824b.f21736b.onMessageChannelReady();
                break;
            case 3:
                this.f20824b.f21736b.onRelationshipValidationResult();
                break;
            case 4:
                this.f20824b.f21736b.onActivityResized();
                break;
            case 5:
                this.f20824b.f21736b.getClass();
                break;
            case 6:
                this.f20824b.f21736b.getClass();
                break;
            default:
                this.f20824b.f21736b.getClass();
                break;
        }
    }
}
