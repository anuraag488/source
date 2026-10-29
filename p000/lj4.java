package p000;

import android.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lj4[], still in use, count: 1, list:
  (r0v1 lj4[]) from 0x005e: INVOKE (r0v1 lj4[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m)] (LINE:95)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lj4 {
    Cut(se0.f30202o, R.string.cut, R.attr.actionModeCutDrawable),
    Copy(se0.f30203p, R.string.copy, R.attr.actionModeCopyDrawable),
    Paste(se0.f30204q, R.string.paste, R.attr.actionModePasteDrawable),
    SelectAll(se0.f30205r, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(se0.f30206s, R.string.autofill, 0);


    /* JADX INFO: renamed from: a */
    public final Object f24086a;

    /* JADX INFO: renamed from: b */
    public final int f24087b;

    /* JADX INFO: renamed from: c */
    public final int f24088c;

    static {
        vd6.m11859r(lj4VarArr);
    }

    public lj4(Object obj, int i, int i2) {
        super(str, i);
        this.f24086a = obj;
        this.f24087b = i;
        this.f24088c = i2;
    }

    public static lj4 valueOf(String str) {
        return (lj4) Enum.valueOf(lj4.class, str);
    }

    public static lj4[] values() {
        return (lj4[]) f24085i.clone();
    }
}
