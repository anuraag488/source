package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ii2 extends hh3 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f21459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii2(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.f21459c = b;
    }

    @Override // p000.hh3
    /* JADX INFO: renamed from: f */
    public final Object mo6400f() {
        byte b = this.f21459c;
        Object obj = this.receiver;
        switch (b) {
            case 0:
                return ((xb4) obj).getValue();
            default:
                return obj.getClass().getSimpleName();
        }
    }
}
