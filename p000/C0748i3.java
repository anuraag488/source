package p000;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0748i3 extends AbstractC0597e3 {

    /* JADX INFO: renamed from: o */
    public static C0748i3 f21087o;

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: a */
    public final int[] mo4905a(int i) {
        int length = m4907d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m4907d().charAt(i) == '\n' && (m4907d().charAt(i) == '\n' || (i != 0 && m4907d().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !m6635n(i2)) {
            i2++;
        }
        return m4906b(i, i2);
    }

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: m */
    public final int[] mo4913m(int i) {
        int length = m4907d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m4907d().charAt(i - 1) == '\n' && !m6635n(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m4907d().charAt(i2) == '\n' || (i2 != 0 && m4907d().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return m4906b(i2, i);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6635n(int i) {
        if (i <= 0 || m4907d().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m4907d().length() || m4907d().charAt(i) == '\n';
    }
}
