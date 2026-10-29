package p000;

import java.nio.charset.CharacterCodingException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class i40 extends AbstractC0856l1 {

    /* JADX INFO: renamed from: g */
    public w42 f21113g;

    /* JADX INFO: renamed from: h */
    public char[] f21114h;

    /* JADX INFO: renamed from: i */
    public int f21115i;

    /* JADX INFO: renamed from: j */
    public t80 f21116j;

    /* JADX INFO: renamed from: C */
    public final void m6637C(int i) throws CharacterCodingException {
        t80 t80Var = this.f21116j;
        char[] cArr = t80Var.f30984a;
        if (i != 0) {
            int i2 = this.f23686b;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = t80Var.f30985b;
        while (i != i3) {
            int iM13047a = ((y80) this.f21113g.f33090b).m13047a(cArr, i, i3 - i);
            if (iM13047a == -1) {
                t80Var.f30985b = Math.min(t80Var.f30984a.length, i);
                this.f21115i = -1;
                break;
            }
            i += iM13047a;
        }
        this.f23686b = 0;
    }

    /* JADX INFO: renamed from: D */
    public final void m6638D() {
        ma2 ma2Var = ma2.f24784c;
        char[] cArr = this.f21114h;
        if (cArr.length == 16384) {
            ma2Var.m3451b(cArr);
            return;
        }
        ma2Var.getClass();
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: c */
    public final void mo6639c(int i, int i2) {
        ((StringBuilder) this.f23690f).append(this.f21116j.f30984a, i, i2 - i);
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: d */
    public boolean mo4480d() throws CharacterCodingException {
        mo6640o();
        int i = this.f23686b;
        while (true) {
            int iMo4485w = mo4485w(i);
            if (iMo4485w == -1) {
                this.f23686b = iMo4485w;
                return false;
            }
            char c = this.f21116j.f30984a[iMo4485w];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.f23686b = iMo4485w;
                return AbstractC0856l1.m7794u(c);
            }
            i = iMo4485w + 1;
        }
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: f */
    public final String mo4481f() throws CharacterCodingException {
        mo4483j('\"');
        int i = this.f23686b;
        t80 t80Var = this.f21116j;
        int i2 = t80Var.f30985b;
        char[] cArr = t80Var.f30984a;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iMo4485w = mo4485w(i);
            int i4 = this.f23686b;
            if (iMo4485w != -1) {
                return m7803m(t80Var, i4, iMo4485w);
            }
            int i5 = i4 > 0 ? i4 - 1 : i4;
            AbstractC0856l1.m7793r(this, zi4.m13621u("Expected quotation mark '\"', but had '", (i4 == t80Var.f30985b || i5 < 0) ? "EOF" : String.valueOf(t80Var.f30984a[i5]), "' instead"), i5, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return m7803m(t80Var, this.f23686b, i6);
            }
        }
        this.f23686b = i3 + 1;
        return od4.m9037R(cArr, i, Math.min(i3, t80Var.f30985b));
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: h */
    public byte mo4482h() throws CharacterCodingException {
        mo6640o();
        int i = this.f23686b;
        while (true) {
            int iMo4485w = mo4485w(i);
            if (iMo4485w == -1) {
                this.f23686b = iMo4485w;
                return (byte) 10;
            }
            int i2 = iMo4485w + 1;
            byte bM13391s = z62.m13391s(this.f21116j.f30984a[iMo4485w]);
            if (bM13391s != 3) {
                this.f23686b = i2;
                return bM13391s;
            }
            i = i2;
        }
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: j */
    public void mo4483j(char c) throws CharacterCodingException {
        mo6640o();
        int i = this.f23686b;
        while (true) {
            int iMo4485w = mo4485w(i);
            if (iMo4485w == -1) {
                this.f23686b = iMo4485w;
                m7796B(c);
                throw null;
            }
            int i2 = iMo4485w + 1;
            char c2 = this.f21116j.f30984a[iMo4485w];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.f23686b = i2;
                if (c2 == c) {
                    return;
                }
                m7796B(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: o */
    public final void mo6640o() throws CharacterCodingException {
        int i = this.f21116j.f30985b - this.f23686b;
        if (i > this.f21115i) {
            return;
        }
        m6637C(i);
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: t */
    public final CharSequence mo4484t() {
        return this.f21116j;
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: w */
    public final int mo4485w(int i) throws CharacterCodingException {
        t80 t80Var = this.f21116j;
        if (i < t80Var.f30985b) {
            return i;
        }
        this.f23686b = i;
        mo6640o();
        return (this.f23686b != 0 || t80Var.length() == 0) ? -1 : 0;
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: x */
    public int mo4486x() throws CharacterCodingException {
        int iMo4485w;
        char c;
        int i = this.f23686b;
        while (true) {
            iMo4485w = mo4485w(i);
            if (iMo4485w == -1 || !((c = this.f21116j.f30984a[iMo4485w]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iMo4485w + 1;
        }
        this.f23686b = iMo4485w;
        return iMo4485w;
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: y */
    public final String mo6641y(int i, int i2) {
        t80 t80Var = this.f21116j;
        return od4.m9037R(t80Var.f30984a, i, Math.min(i2, t80Var.f30985b));
    }
}
