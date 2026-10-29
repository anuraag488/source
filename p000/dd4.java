package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class dd4 extends AbstractC0856l1 {

    /* JADX INFO: renamed from: g */
    public String f16996g;

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: d */
    public boolean mo4480d() {
        int i = this.f23686b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f16996g;
            if (i >= str.length()) {
                this.f23686b = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f23686b = i;
                return AbstractC0856l1.m7794u(cCharAt);
            }
            i++;
        }
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: f */
    public final String mo4481f() {
        mo4483j('\"');
        int i = this.f23686b;
        String str = this.f16996g;
        int iM6342h0 = hd4.m6342h0(str, '\"', i, 4);
        if (iM6342h0 == -1) {
            m7804n();
            int i2 = this.f23686b;
            AbstractC0856l1.m7793r(this, zi4.m13621u("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, 4);
            throw null;
        }
        for (int i3 = i; i3 < iM6342h0; i3++) {
            if (str.charAt(i3) == '\\') {
                return m7803m(str, this.f23686b, i3);
            }
        }
        this.f23686b = iM6342h0 + 1;
        return str.substring(i, iM6342h0);
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: h */
    public byte mo4482h() {
        String str;
        int i = this.f23686b;
        while (true) {
            str = this.f16996g;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f23686b = i2;
                return z62.m13391s(cCharAt);
            }
            i = i2;
        }
        this.f23686b = str.length();
        return (byte) 10;
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: j */
    public void mo4483j(char c) {
        int i = this.f23686b;
        if (i == -1) {
            m7796B(c);
            throw null;
        }
        while (true) {
            String str = this.f16996g;
            if (i >= str.length()) {
                this.f23686b = -1;
                m7796B(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f23686b = i2;
                if (cCharAt == c) {
                    return;
                }
                m7796B(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: t */
    public final CharSequence mo4484t() {
        return this.f16996g;
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: w */
    public final int mo4485w(int i) {
        if (i < this.f16996g.length()) {
            return i;
        }
        return -1;
    }

    @Override // p000.AbstractC0856l1
    /* JADX INFO: renamed from: x */
    public int mo4486x() {
        char cCharAt;
        int i = this.f23686b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f16996g;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f23686b = i;
        return i;
    }
}
