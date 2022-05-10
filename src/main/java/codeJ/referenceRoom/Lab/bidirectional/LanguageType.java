package codeJ.referenceRoom.Lab.bidirectional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LanguageType {

    C("c"),
    C_PLUSPLUS("cplus"),
    c_SHARP("csharp"),
    SPRING("spring"),
    JAVASCRIPT("javascript"),
    TYPESCRIPT("typescript"),
    REACT_JS("react"),
    VUE_JS("vue"),
    NODE_JS("note"),
    PYTHON("python"),
    DJANGO("django"),
    GO("go"),
    SWIFT("swift"),
    KOTLIN("kotlin"),
    ANGULAR_JS("angular"),
    RUBY("ruby"),
    JAVA("java"),
    FLUTTER("flutter");




    private final String value;



}

