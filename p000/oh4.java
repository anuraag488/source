package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 oh4[], still in use, count: 1, list:
  (r0v1 oh4[]) from 0x0020: INVOKE (r0v1 oh4[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m), WRAPPED] (LINE:33)
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
public final class oh4 {
    f26701c("Notifications", "accessibility_desc_notification_shade"),
    f26702d("QuickSettings", "accessibility_desc_quick_settings");


    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ v91 f26704f;

    /* JADX INFO: renamed from: a */
    public final String f26705a;

    /* JADX INFO: renamed from: b */
    public final byte f26706b;

    static {
        f26704f = vd6.m11859r(oh4VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oh4(String str, String str2) {
        super(str, i);
        this.f26705a = str2;
        this.f26706b = i;
    }

    public static oh4 valueOf(String str) {
        return (oh4) Enum.valueOf(oh4.class, str);
    }

    public static oh4[] values() {
        return (oh4[]) f26703e.clone();
    }
}
