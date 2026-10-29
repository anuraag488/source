package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rx2 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final rx2 f29704b = new rx2(0);

    /* JADX INFO: renamed from: c */
    public static final rx2 f29705c = new rx2(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29706a;

    public /* synthetic */ rx2(byte b) {
        this.f29706a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f29706a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f29706a) {
            case 0:
                return f29705c;
            default:
                return f29704b;
        }
    }
}
