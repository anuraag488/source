package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ab4 implements Iterator {

    /* JADX INFO: renamed from: b */
    public String f233b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f234c;

    /* JADX INFO: renamed from: e */
    public int f236e;

    /* JADX INFO: renamed from: a */
    public int f232a = 2;

    /* JADX INFO: renamed from: d */
    public int f235d = 0;

    public ab4(wd3 wd3Var, CharSequence charSequence) {
        int i = v80.f32455l;
        this.f236e = Integer.MAX_VALUE;
        this.f234c = charSequence;
    }

    /* JADX INFO: renamed from: a */
    public int mo175a(int i) {
        return i + 1;
    }

    /* JADX INFO: renamed from: b */
    public int mo176b(int i) {
        int i2 = i + 4000;
        if (i2 < this.f234c.length()) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iMo175a;
        int i = this.f232a;
        if (i == 4) {
            xy4.m12787p();
            return false;
        }
        int iM4376u = d55.m4376u(i);
        if (iM4376u == 0) {
            return true;
        }
        if (iM4376u != 2) {
            this.f232a = 4;
            int i2 = this.f235d;
            while (true) {
                int i3 = this.f235d;
                if (i3 == -1) {
                    this.f232a = 3;
                    string = null;
                    break;
                }
                int iMo176b = mo176b(i3);
                CharSequence charSequence = this.f234c;
                if (iMo176b == -1) {
                    iMo176b = charSequence.length();
                    this.f235d = -1;
                    iMo175a = -1;
                } else {
                    iMo175a = mo175a(iMo176b);
                    this.f235d = iMo175a;
                }
                if (iMo175a != i2) {
                    if (i2 < iMo176b) {
                        charSequence.charAt(i2);
                    }
                    if (iMo176b > i2) {
                        charSequence.charAt(iMo176b - 1);
                    }
                    int i4 = this.f236e;
                    if (i4 == 1) {
                        iMo176b = charSequence.length();
                        this.f235d = -1;
                        if (iMo176b > i2) {
                            charSequence.charAt(iMo176b - 1);
                        }
                    } else {
                        this.f236e = i4 - 1;
                    }
                    string = charSequence.subSequence(i2, iMo176b).toString();
                    break;
                }
                int i5 = iMo175a + 1;
                this.f235d = i5;
                if (i5 > charSequence.length()) {
                    this.f235d = -1;
                }
            }
            this.f233b = string;
            if (this.f232a != 3) {
                this.f232a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        this.f232a = 2;
        String str = this.f233b;
        this.f233b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
