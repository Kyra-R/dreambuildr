import * as React from 'react';
import {Dispatch} from "react";

const CatalogueSidebar = (props: {type: string, setType: Dispatch<any>}) => {
    function getButtonState(type: string) {
        return props.type === type ? "category-button-selected" : "category-button";
    }

    return (
        <div className="bg-white rounded-xl flex flex-col items-center gap-2">
            <h2 className="styled-text pt-3 font-extrabold">Filters</h2>
            <h3 className="font-title text-2xl font-bold tracking-widest italic">Categories</h3>
            <button className={getButtonState("motherboard")}
                    onClick={() => props.setType("motherboard")}>
                Motherboards
            </button>
            <button className={getButtonState("cpu")}
                    onClick={() => props.setType("cpu")}>
                CPUs
            </button>
            <button className={getButtonState("ram")}
                    onClick={() => props.setType("ram")}>
                RAMs
            </button>
            <button className={getButtonState("powerunit")}
                    onClick={() => props.setType("powerunit")}>
                Power units
            </button>
            <button className={getButtonState("drive")}
                    onClick={() => props.setType("drive")}>
                HDDs/SSDs
            </button>
            <button className={getButtonState("videocard")}
                    onClick={() => props.setType("videocard")}>
                Video cards
            </button>
            <h3 className="font-title text-2xl font-bold tracking-widest italic">Sorting by</h3>
            <select name="sort-parameter" id="sort-parameter" className="sort-dropdown">
                <option value="name">Name</option>
                <option value="price">Price</option>
            </select>
            <select name="sort-order" id="sort-order" className="sort-dropdown">
                <option value="asc">Ascending</option>
                <option value="desc">Descending</option>
            </select>
            <h3 className="font-title text-2xl font-bold tracking-widest italic">Filter properties</h3>
        </div>
    );
};

export default CatalogueSidebar;