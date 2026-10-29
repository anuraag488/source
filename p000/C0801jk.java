package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: jk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0801jk implements Appendable {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f22345a = new StringBuilder(16);

    /* JADX INFO: renamed from: b */
    public final ArrayList f22346b;

    public C0801jk(C0875lk c0875lk) {
        new ArrayList();
        this.f22346b = new ArrayList();
        new ArrayList();
        m7132a(c0875lk);
    }

    /* JADX INFO: renamed from: a */
    public final void m7132a(C0875lk c0875lk) {
        StringBuilder sb = this.f22345a;
        int length = sb.length();
        sb.append(c0875lk.f24092b);
        List list = c0875lk.f24091a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0838kk c0838kk = (C0838kk) list.get(i);
                this.f22346b.add(new C0764ik(c0838kk.f23186a, c0838kk.f23187b + length, c0838kk.f23188c + length, c0838kk.f23189d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof C0875lk;
        StringBuilder sb = this.f22345a;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        C0875lk c0875lk = (C0875lk) charSequence;
        int length = sb.length();
        sb.append((CharSequence) c0875lk.f24092b, i, i2);
        List listM8335a = AbstractC0912mk.m8335a(c0875lk, i, i2, null);
        if (listM8335a != null) {
            int size = listM8335a.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0838kk c0838kk = (C0838kk) listM8335a.get(i3);
                this.f22346b.add(new C0764ik(c0838kk.f23186a, c0838kk.f23187b + length, c0838kk.f23188c + length, c0838kk.f23189d));
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C0875lk m7133b() {
        StringBuilder sb = this.f22345a;
        String string = sb.toString();
        ArrayList arrayList = this.f22346b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0764ik c0764ik = (C0764ik) arrayList.get(i);
            int length = sb.length();
            int i2 = c0764ik.f21502c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                r32.m10187b("Item.end should be set first");
            }
            arrayList2.add(new C0838kk(c0764ik.f21500a, c0764ik.f21501b, length, c0764ik.f21503d));
        }
        return new C0875lk(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0875lk) {
            m7132a((C0875lk) charSequence);
            return this;
        }
        this.f22345a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f22345a.append(c);
        return this;
    }
}
