package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class o14 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f26289a = {new jw2(o14.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new jw2(o14.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new jw2(o14.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new jw2(o14.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new jw2(o14.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jw2(o14.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jw2(o14.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jw2(o14.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jw2(o14.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new jw2(o14.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new jw2(o14.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new jw2(o14.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new jw2(o14.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new jw2(o14.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new jw2(o14.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new jw2(o14.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new jw2(o14.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new jw2(o14.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jw2(o14.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new jw2(o14.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new jw2(o14.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new jw2(o14.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new jw2(o14.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new jw2(o14.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jw2(o14.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new jw2(o14.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new jw2(o14.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new jw2(o14.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new jw2(o14.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jw2(o14.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new jw2(o14.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new jw2(o14.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        p14 p14Var = m14.f24552a;
        p14 p14Var2 = d14.f16704a;
    }

    /* JADX INFO: renamed from: a */
    public static void m8920a(q14 q14Var, yp1 yp1Var) {
        q14Var.mo4898a(d14.f16704a, new C1353y2(null, yp1Var));
    }

    /* JADX INFO: renamed from: b */
    public static final void m8921b(q14 q14Var, String str) {
        p14 p14Var = m14.f24552a;
        q14Var.mo4898a(m14.f24552a, Collections.singletonList(str));
    }

    /* JADX INFO: renamed from: c */
    public static final void m8922c(q14 q14Var, mm0 mm0Var) {
        p14 p14Var = m14.f24552a;
        p14 p14Var2 = m14.f24569r;
        ic2 ic2Var = f26289a[8];
        p14Var2.getClass();
        q14Var.mo4898a(p14Var2, mm0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m8923d(q14 q14Var, int i) {
        p14 p14Var = m14.f24576y;
        ic2 ic2Var = f26289a[14];
        lq3 lq3Var = new lq3();
        lq3Var.f24281a = i;
        VarHandle.storeStoreFence();
        p14Var.getClass();
        q14Var.mo4898a(p14Var, lq3Var);
    }

    /* JADX INFO: renamed from: e */
    public static final void m8924e(q14 q14Var, p44 p44Var) {
        p14 p14Var = m14.f24552a;
        p14 p14Var2 = m14.f24551R;
        ic2 ic2Var = f26289a[30];
        p14Var2.getClass();
        q14Var.mo4898a(p14Var2, p44Var);
    }

    /* JADX INFO: renamed from: f */
    public static final void m8925f(q14 q14Var) {
        p14 p14Var = m14.f24565n;
        ic2 ic2Var = f26289a[6];
        Boolean bool = Boolean.TRUE;
        p14Var.getClass();
        q14Var.mo4898a(p14Var, bool);
    }
}
