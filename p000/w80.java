package p000;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w80 implements CharacterIterator {

    /* JADX INFO: renamed from: a */
    public final CharSequence f33150a;

    /* JADX INFO: renamed from: b */
    public final int f33151b;

    /* JADX INFO: renamed from: c */
    public int f33152c = 0;

    public w80(CharSequence charSequence, int i) {
        this.f33150a = charSequence;
        this.f33151b = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f33152c;
        if (i == this.f33151b) {
            return (char) 65535;
        }
        return this.f33150a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f33152c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f33151b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f33152c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f33151b;
        if (i == 0) {
            this.f33152c = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f33152c = i2;
        return this.f33150a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f33152c + 1;
        this.f33152c = i;
        int i2 = this.f33151b;
        if (i < i2) {
            return this.f33150a.charAt(i);
        }
        this.f33152c = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f33152c;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f33152c = i2;
        return this.f33150a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f33151b || i < 0) {
            C1077qn.m9987m("invalid position");
            return (char) 0;
        }
        this.f33152c = i;
        return current();
    }
}
