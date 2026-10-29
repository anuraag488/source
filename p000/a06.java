package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a06 implements Iterator {

    /* JADX INFO: renamed from: a */
    public String f23a;

    /* JADX INFO: renamed from: b */
    public byte f24b;

    /* JADX INFO: renamed from: c */
    public String f25c;

    /* JADX INFO: renamed from: d */
    public int f26d;

    /* JADX INFO: renamed from: e */
    public int f27e;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        byte b = this.f24b;
        if (b == 4) {
            xy4.m12787p();
            return false;
        }
        int i2 = b - 1;
        String string = null;
        if (b == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f24b = (byte) 4;
            String str = this.f25c;
            int i3 = this.f26d;
            while (true) {
                int length = this.f26d;
                if (length == -1) {
                    this.f24b = (byte) 3;
                    break;
                }
                int length2 = str.length();
                xz5.m12801b(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == ',') {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f26d = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.f26d = i;
                }
                if (i != i3) {
                    if (i3 < length) {
                        str.charAt(i3);
                    }
                    if (i3 < length) {
                        str.charAt(length - 1);
                    }
                    int i4 = this.f27e;
                    if (i4 == 1) {
                        length = str.length();
                        this.f26d = -1;
                        if (length > i3) {
                            str.charAt(length - 1);
                        }
                    } else {
                        this.f27e = i4 - 1;
                    }
                    string = str.subSequence(i3, length).toString();
                    break;
                }
                int i5 = i + 1;
                this.f26d = i5;
                if (i5 > str.length()) {
                    this.f26d = -1;
                }
            }
            this.f23a = string;
            if (this.f24b != 3) {
                this.f24b = (byte) 1;
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
        this.f24b = (byte) 2;
        String str = this.f23a;
        this.f23a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
