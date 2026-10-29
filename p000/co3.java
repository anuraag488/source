package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 co3[], still in use, count: 1, list:
  (r0v1 co3[]) from 0x003a: INVOKE (r0v1 co3[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m), WRAPPED] (LINE:59)
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
public final class co3 {
    MAX_AD_CONTENT_RATING_UNSPECIFIED(""),
    /* JADX INFO: Fake field, exist only in values array */
    MAX_AD_CONTENT_RATING_G("G"),
    /* JADX INFO: Fake field, exist only in values array */
    MAX_AD_CONTENT_RATING_PG("PG"),
    /* JADX INFO: Fake field, exist only in values array */
    MAX_AD_CONTENT_RATING_T("T"),
    /* JADX INFO: Fake field, exist only in values array */
    MAX_AD_CONTENT_RATING_MA("MA");


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v91 f16182d;

    /* JADX INFO: renamed from: a */
    public final String f16183a;

    static {
        f16182d = vd6.m11859r(co3VarArr);
    }

    public co3(String str) {
        super(str, i);
        this.f16183a = str;
    }

    public static co3[] values() {
        return (co3[]) f16181c.clone();
    }
}
