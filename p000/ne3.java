package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ne3 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25733a;

    /* JADX INFO: renamed from: b */
    public Iterator f25734b;

    /* JADX INFO: renamed from: c */
    public Iterator f25735c;

    public /* synthetic */ ne3(byte b) {
        this.f25733a = b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f25733a) {
            case 0:
                return this.f25734b.hasNext() || this.f25735c.hasNext();
            default:
                if (this.f25734b.hasNext()) {
                    return true;
                }
                return this.f25735c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f25733a) {
            case 0:
                Iterator it = this.f25734b;
                return it.hasNext() ? it.next() : this.f25735c.next();
            default:
                Iterator it2 = this.f25734b;
                if (it2.hasNext()) {
                    return new sq5(((Integer) it2.next()).toString());
                }
                Iterator it3 = this.f25735c;
                if (it3.hasNext()) {
                    return new sq5((String) it3.next());
                }
                xy4.m12795x();
                return null;
        }
    }
}
