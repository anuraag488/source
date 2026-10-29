package p000;

import java.text.BreakIterator;

/* JADX INFO: renamed from: f3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0636f3 extends AbstractC0597e3 {

    /* JADX INFO: renamed from: q */
    public static C0636f3 f18695q;

    /* JADX INFO: renamed from: r */
    public static C0636f3 f18696r;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ byte f18697o;

    /* JADX INFO: renamed from: p */
    public BreakIterator f18698p;

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: a */
    public final int[] mo4905a(int i) {
        switch (this.f18697o) {
            case 0:
                int length = m4907d().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.f18698p;
                    if (breakIterator == null) {
                        z62.m13366Y("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.f18698p;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            z62.m13366Y("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m4906b(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        z62.m13366Y("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (m4907d().length() <= 0 || i >= m4907d().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m5462p(i) && (!m5462p(i) || (i != 0 && m5462p(i - 1)))) {
                    BreakIterator breakIterator3 = this.f18698p;
                    if (breakIterator3 == null) {
                        z62.m13366Y("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f18698p;
                if (breakIterator4 == null) {
                    z62.m13366Y("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m5461o(iFollowing2)) {
                    return null;
                }
                return m4906b(i, iFollowing2);
        }
    }

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: m */
    public final int[] mo4913m(int i) {
        switch (this.f18697o) {
            case 0:
                int length = m4907d().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.f18698p;
                    if (breakIterator == null) {
                        z62.m13366Y("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.f18698p;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            z62.m13366Y("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m4906b(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        z62.m13366Y("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = m4907d().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m5462p(i - 1) && !m5461o(i)) {
                    BreakIterator breakIterator3 = this.f18698p;
                    if (breakIterator3 == null) {
                        z62.m13366Y("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f18698p;
                if (breakIterator4 == null) {
                    z62.m13366Y("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !m5462p(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m5462p(iPreceding2 - 1)) {
                    return m4906b(iPreceding2, i);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5460n(String str) {
        switch (this.f18697o) {
            case 0:
                this.f17656a = str;
                BreakIterator breakIterator = this.f18698p;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    z62.m13366Y("impl");
                    throw null;
                }
            default:
                this.f17656a = str;
                BreakIterator breakIterator2 = this.f18698p;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    z62.m13366Y("impl");
                    throw null;
                }
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m5461o(int i) {
        if (i <= 0 || !m5462p(i - 1)) {
            return false;
        }
        return i == m4907d().length() || !m5462p(i);
    }

    /* JADX INFO: renamed from: p */
    public boolean m5462p(int i) {
        if (i < 0 || i >= m4907d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m4907d().codePointAt(i));
    }
}
