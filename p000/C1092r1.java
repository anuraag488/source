package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1092r1 extends AbstractC1129s1 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC1129s1 f28941a;

    /* JADX INFO: renamed from: b */
    public final int f28942b;

    /* JADX INFO: renamed from: c */
    public final int f28943c;

    public C1092r1(AbstractC1129s1 abstractC1129s1, int i, int i2) {
        this.f28941a = abstractC1129s1;
        this.f28942b = i;
        qq2.m10026j(i, i2, abstractC1129s1.mo103a());
        this.f28943c = i2 - i;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        return this.f28943c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f28943c;
        if (i < 0 || i >= i2) {
            xy4.m12792u(zi4.m13618r(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.f28941a.get(this.f28942b + i);
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final List subList(int i, int i2) {
        qq2.m10026j(i, i2, this.f28943c);
        int i3 = this.f28942b;
        return new C1092r1(this.f28941a, i + i3, i3 + i2);
    }
}
