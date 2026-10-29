package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v31 oc2[], still in use, count: 1, list:
  (r0v31 oc2[]) from 0x02b8: INVOKE (r0v31 oc2[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m)] (LINE:697)
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
public final class oc2 {
    LEFT_CHAR(0),
    RIGHT_CHAR(1),
    RIGHT_WORD(2),
    LEFT_WORD(3),
    NEXT_PARAGRAPH(4),
    PREV_PARAGRAPH(5),
    LINE_START(6),
    LINE_END(7),
    LINE_LEFT(8),
    LINE_RIGHT(9),
    UP(10),
    DOWN(11),
    CENTER(12),
    PAGE_UP(13),
    PAGE_DOWN(14),
    HOME(15),
    END(16),
    COPY(17),
    PASTE(18),
    CUT(19),
    DELETE_PREV_CHAR(20),
    DELETE_NEXT_CHAR(21),
    DELETE_PREV_WORD(22),
    DELETE_NEXT_WORD(23),
    DELETE_FROM_LINE_START(24),
    DELETE_TO_LINE_END(25),
    SELECT_ALL(26),
    SELECT_LEFT_CHAR(27),
    SELECT_RIGHT_CHAR(28),
    SELECT_UP(29),
    SELECT_DOWN(30),
    SELECT_PAGE_UP(31),
    SELECT_PAGE_DOWN(32),
    SELECT_HOME(33),
    SELECT_END(34),
    SELECT_LEFT_WORD(35),
    SELECT_RIGHT_WORD(36),
    SELECT_NEXT_PARAGRAPH(37),
    SELECT_PREV_PARAGRAPH(38),
    SELECT_LINE_START(39),
    SELECT_LINE_END(40),
    SELECT_LINE_LEFT(41),
    SELECT_LINE_RIGHT(42),
    DESELECT(43),
    NEW_LINE(44),
    TAB(45),
    UNDO(46),
    REDO(47),
    /* JADX INFO: Fake field, exist only in values array */
    CHARACTER_PALETTE(48);


    /* JADX INFO: renamed from: a */
    public final boolean f26622a;

    static {
        vd6.m11859r(oc2VarArr);
    }

    public oc2(int i) {
        super(str, i);
        this.f26622a = z;
    }

    public static oc2 valueOf(String str) {
        return (oc2) Enum.valueOf(oc2.class, str);
    }

    public static oc2[] values() {
        return (oc2[]) f26596X.clone();
    }
}
