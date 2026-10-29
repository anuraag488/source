package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ff0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f18940b = AbstractC1078qo.f28633a.objectFieldOffset(ff0.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f18941a;

    public ff0(Throwable th, boolean z) {
        this.f18941a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f18941a + ']';
    }
}
