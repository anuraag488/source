package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class b50 {

    /* JADX INFO: renamed from: a */
    public final C0461ao f15084a;

    /* JADX INFO: renamed from: b */
    public int f15085b;

    public b50(byte b) {
        switch (b) {
            case 1:
                this.f15084a = new C0461ao();
                break;
            default:
                this.f15084a = new C0461ao();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3450a(byte[] bArr) {
        synchronized (this) {
            int i = this.f15085b;
            if (bArr.length + i < AbstractC0842ko.f23268a) {
                this.f15085b = i + (bArr.length / 2);
                this.f15084a.addLast(bArr);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3451b(char[] cArr) {
        synchronized (this) {
            int i = this.f15085b;
            if (cArr.length + i < AbstractC0842ko.f23268a) {
                this.f15085b = i + cArr.length;
                this.f15084a.addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public byte[] m3452c(int i) {
        byte[] bArr;
        synchronized (this) {
            C0461ao c0461ao = this.f15084a;
            bArr = null;
            byte[] bArr2 = (byte[]) (c0461ao.isEmpty() ? null : c0461ao.removeLast());
            if (bArr2 != null) {
                this.f15085b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    /* JADX INFO: renamed from: d */
    public char[] m3453d(int i) {
        char[] cArr;
        synchronized (this) {
            C0461ao c0461ao = this.f15084a;
            cArr = null;
            char[] cArr2 = (char[]) (c0461ao.isEmpty() ? null : c0461ao.removeLast());
            if (cArr2 != null) {
                this.f15085b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
